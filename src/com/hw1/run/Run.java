package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;



public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		emp[1] = new Employee(1,"홍길동",19,'m',"01022223333","서울 잠실");
		emp[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,
				"01011112222","서울 잠실");
		
		for(int i= 0; i< emp.length; i++) {
			System.out.println( "emp[" + i + "] : " + emp[i].information() );
		}
		System.out.println("=====================================");
		
		
		for(int i= 0; i< emp.length; i++) {
			if(i==0) {
			 emp[i]= new Employee(0,"김말똥","영업부","팀장",30,
						'M',3000000,0.2,"01055559999","전라도 광주");
			
			 System.out.println( "emp[" + i + "] : " + emp[i].information() );
			}if(i==1) {
			
			emp[i]= new Employee(1,"홍길동","기획부","부장",19,'m',4000000,0.3,"01022223333","서울 잠실");
			 System.out.println( "emp[" + i + "] : " + emp[i].information() );
			
			 System.out.println("=====================================");
			
			
				
			}
			
			}
		
		//
		int sum = 0;
		int num = 0;
		
		for(int i= 0; i< emp.length; i++) {
			
			
		num =	(int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
		System.out.println(emp[i].getEmpName() + "의 연봉 : " + num + 
				"원");
		
		sum +=num;
			
		}
		 System.out.println("=====================================");
		 System.out.println("직원들의 연봉의 평균 : " + sum/3 + "원");
		
		
		
		}
	
	
	
	}

		
		
		
		
		

	
//		1. 3개의 생성자를 사용하여 3명의 사원 정보를 배열로 생성한 후 출력 해보고
//		2. 값이 없는 필드에 각각 값을 입력해 넣어 출력.
//		3. 직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고
//		4. 총 직원 연봉의 평균을 구하여 출력
		
		//객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 생성하여
		//객체 생성 후 출력
		
		
	


		
		
		
		

		
		


