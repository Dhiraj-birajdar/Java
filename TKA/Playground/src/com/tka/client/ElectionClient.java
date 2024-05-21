package com.tka.client;
import com.tka.controller.ElectionController;

public class ElectionClient {

	public static void main(String[] args) {
		ElectionController ec = new ElectionController();

		System.out.println("All StateName : ");
		for(String stateName : ec.fetchCandidatesFromAllStates())
			System.out.print(stateName+", ");

		System.out.println("\n\nStateName starts with S : ");
		for(String stateName : ec.fetchCandidatesStartsWithS())
			System.out.print(stateName+", ");

		System.out.println("\n\nStateName starts with M : ");
		for(String stateName : ec.fetchCandidatesStartsWithM())
			System.out.print(stateName+", ");

		System.out.println("\n\nStateName starts with M or K : ");
		for(String stateName : ec.fetchCandidatesStartsWithMandK())
			System.out.print(stateName+", ");

		System.out.println("\n\nStateName sorted : ");
		for(String stateName : ec.fetchCandidatesSorted())
			System.out.print(stateName+", ");
	}
}
