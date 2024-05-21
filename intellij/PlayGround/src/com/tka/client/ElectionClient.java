package com.tka.client;
import java.util.ArrayList;
import com.tka.controller.ElectionController;

public class ElectionClient {

	public static void main(String[] args) {
		ElectionController ec = new ElectionController();
		ArrayList<String> listStates = ec.fetchCandidatesFromAllStates();

		System.out.println("All StateName : ");
		listStates.forEach(stateName->System.out.print(stateName+", "));

		System.out.println("\n\nStateName starts with S : ");
		ec.fetchCandidatesStartsWithS().forEach(stateName->System.out.print(stateName+", "));

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
