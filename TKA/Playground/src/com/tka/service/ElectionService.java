package com.tka.service;
import java.util.ArrayList;
import java.util.Collections;

import com.tka.dao.ElectionDao;

public class ElectionService {

	public ArrayList<String> fetchCandidatesFromAllStates(){
		ElectionDao ed = new ElectionDao();
        return ed.fetchCandidatesFromAllStates();
	}

	public ArrayList<String> fetchCandidatesStartsWithS(){
		ElectionDao ed = new ElectionDao();
	    ArrayList<String> listStates = ed.fetchCandidatesFromAllStates();
		ArrayList<String> listStatesStartsWithS = new ArrayList<String>();
		for(String stateName : listStates){
			if(stateName.startsWith("S"))
				listStatesStartsWithS.add(stateName);
		}
		return listStatesStartsWithS;
	}

	public ArrayList<String> fetchCandidatesStartsWithM(){
		ElectionDao ed = new ElectionDao();
	    ArrayList<String> listStates = ed.fetchCandidatesFromAllStates();
		ArrayList<String> listStatesStartsWithM = new ArrayList<String>();
		for(String stateName : listStates){
			if(stateName.startsWith("M"))
				listStatesStartsWithM.add(stateName);
		}
		return listStatesStartsWithM;
	}

	public ArrayList<String> fetchCandidatesStartsWithMandK(){
		ElectionDao ed = new ElectionDao();
	    ArrayList<String> listStates = ed.fetchCandidatesFromAllStates();
		ArrayList<String> listStatesStartsWithMandK = new ArrayList<String>();
		for(String stateName : listStates){
			if(stateName.startsWith("M") || stateName.startsWith("K"))
				listStatesStartsWithMandK.add(stateName);
		}
		return listStatesStartsWithMandK;
	}

	public ArrayList<String> fetchCandidatesSorted(){
		ElectionDao ed = new ElectionDao();
		ArrayList<String> listStates = ed.fetchCandidatesFromAllStates();
		Collections.sort(listStates);
		return listStates;
	}
}
