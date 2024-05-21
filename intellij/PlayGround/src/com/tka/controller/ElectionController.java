package com.tka.controller;
import com.tka.service.ElectionService;
import java.util.ArrayList;

public class ElectionController {

	ElectionService es = new ElectionService();

	public ArrayList<String> fetchCandidatesFromAllStates(){
        return es.fetchCandidatesFromAllStates();
	}
	public ArrayList<String> fetchCandidatesStartsWithS(){
	    return es.fetchCandidatesStartsWithS();
	}
	public ArrayList<String> fetchCandidatesStartsWithM(){
	    return es.fetchCandidatesStartsWithM();
	}
	public ArrayList<String> fetchCandidatesStartsWithMandK(){
	    return es.fetchCandidatesStartsWithMandK();
	}
	public ArrayList<String> fetchCandidatesSorted(){
	    return es.fetchCandidatesSorted();
	}
}
