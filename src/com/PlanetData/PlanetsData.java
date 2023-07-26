package com.PlanetData;

import java.util.ArrayList;
import java.util.List;

public class PlanetsData {

	public static void main(String[] args) {
		PlanetInit planet1 = new PlanetInit ();
		planet1.Planet = "Mercury";
		planet1.moons = 0;
		planet1.rings=false ; 
		
		PlanetInit planet2 = new PlanetInit ();
		planet2.Planet = "Venus";
		planet2.gases.add("Carbon Dioxide");
		planet2.gases.add("Nitrogen");
		planet2.moons = 0;
		planet2.rings=false ; 
		
		PlanetInit planet3 = new PlanetInit ();
		planet3.Planet = "Earth";
		planet3.gases.add("Nitrogen");
		planet3.gases.add("Oxygen");
		planet3.moons = 1;
		planet3.rings=false ;
		
		PlanetInit planet4 = new PlanetInit ();
		planet4.Planet = "Jupitor";
		planet4.gases.add("Hydrogen");
		planet4.gases.add("Helium");
		planet4.moons = 79;
		planet4.rings=true ;
		
		PlanetInit planet5 = new PlanetInit ();
		planet5.Planet = "Saturn";
		planet5.gases.add("Hydrogen");
		planet5.gases.add("Helium");
		planet5.moons = 83;
		planet5.rings=true ;
		
		PlanetInit planet6 = new PlanetInit ();
		planet6.Planet = "Uranus";
		planet6.gases.add("Hydrogen");
		planet6.gases.add("Helium");
		planet6.gases.add("Methane");
		planet6.moons = 27;
		planet6.rings=true ;
		
		List <PlanetInit> planetaries = new ArrayList <> () ;
		planetaries.add(planet1);
		planetaries.add(planet2);
		planetaries.add(planet3);
		planetaries.add(planet4);
		planetaries.add(planet5);
		planetaries.add(planet6);
		
		System.out.println("Total moons of planets with rings: " + totalMoonsWithRings(planetaries));
		
	}
	public static int totalMoonsWithRings (List<PlanetInit> planetaries)
	{
		int moonSum = 0;
		for (PlanetInit planet : planetaries) {
			if (planet.rings) {
				moonSum += planet.moons;
			}
		}
		return moonSum;
	}

}
