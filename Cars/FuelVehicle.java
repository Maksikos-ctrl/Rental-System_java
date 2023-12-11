package Cars;

interface FuelVehicle

{
/**
* Get the remaining fuel level of the fuel vehicle.
*
* @return The remaining fuel level in liters.
*/
double getFuelLevel();
/**
* Refuel the fuel vehicle to the specified fuel level.
*
* @param fuelLevel The target fuel level to refuel to.
*/
void refuel(double fuelLevel);

}