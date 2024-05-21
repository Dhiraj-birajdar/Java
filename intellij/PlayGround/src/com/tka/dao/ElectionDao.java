package com.tka.dao;
import java.util.ArrayList;

public class ElectionDao {

	public ArrayList<String> fetchCandidatesFromAllStates(){
		ArrayList<String> al = new ArrayList<>();
		al.add("MH");
		al.add("UP");
		al.add("MP");
		al.add("AP");
		al.add("TN");
		al.add("KL");
		al.add("KA");
		al.add("GJ");
		al.add("SK");

		return al;
	}
}
