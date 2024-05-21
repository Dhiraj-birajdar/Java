package com.tka.controller;
import com.tka.service.ElectionService;
import java.util.ArrayList;

public class ElectionController {

	public ArrayList<String> fetchCandidatesFromAllStates(){
		ElectionService es = new ElectionService();
        return es.fetchCandidatesFromAllStates();
	}

	public ArrayList<String> fetchCandidatesStartsWithS(){
		ElectionService es = new ElectionService();
	    return es.fetchCandidatesStartsWithS();
	}
	public ArrayList<String> fetchCandidatesStartsWithM(){
		ElectionService es = new ElectionService();
	    return es.fetchCandidatesStartsWithM();
	}
	public ArrayList<String> fetchCandidatesStartsWithMandK(){
		ElectionService es = new ElectionService();
	    return es.fetchCandidatesStartsWithMandK();
	}
	public ArrayList<String> fetchCandidatesSorted(){
		ElectionService es = new ElectionService();
	    return es.fetchCandidatesSorted();
	}
}
