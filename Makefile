JC = javac
JFLAGS = -g
SRCDIR = src
BINDIR = bin
MAIN = Main
SOURCES = $(wildcard $(SRCDIR)/*.java)
CLASSES = $(patsubst $(SRCDIR)/%.java, $(BINDIR)/%.class, $(SOURCES))

all: $(CLASSES)

$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JC) $(JFLAGS) -d $(BINDIR) $<

run: all
	java -cp $(BINDIR):. $(MAIN)

clean:
	rm -rf $(BINDIR)/*

.PHONY: all run clean
