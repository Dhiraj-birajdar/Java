package com.bmisort.service;

import com.bmisort.entity.Student;
import com.bmisort.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void save(List<Student> ls){
        
		studentRepository.saveAll(ls);
    }

    public String pascal(int n){

		System.err.println(studentRepository.max());

        StringBuilder sb = new StringBuilder("");
		int[][] arr = new int[n][n];
		for(int i=0;i<n;arr[i][0]=1,i++);

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}

		for (int i = 0; i < n; i++) {

			printAndBuild(n, sb, arr, i);

		}
		for (int i = n-2; i >= 0; i--) {

			printAndBuild(n, sb, arr, i);

		}


		return sb.toString();
    }

	private void printAndBuild(int n, StringBuilder sb, int[][] arr, int i) {
		for (int j = n-1; j >= 0 ; j--) {

			System.out.print(arr[i][j]==0?" ":arr[i][j]+" ");
			sb.append(arr[i][j]==0?"_":arr[i][j]+"_");
		}
		System.out.println();
		sb.append("<br>");
	}


}
