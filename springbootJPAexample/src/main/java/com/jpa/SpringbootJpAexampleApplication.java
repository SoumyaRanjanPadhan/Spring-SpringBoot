package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.PeopleRepo;
import com.jpa.entity.PeopleTable;

@SpringBootApplication
public class SpringbootJpAexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootJpAexampleApplication.class, args);
	    
		PeopleRepo peopleRepo = con.getBean(PeopleRepo.class);
		
		//create
//	    PeopleTable user=new PeopleTable();
//	    user.setName("soumya ranjan padhan");
//	    user.setCity("bbsr");
//	    user.setStatus("java developer");
//	    //saving single user
//	    PeopleTable people=peopleRepo.save(user);
//	    System.out.println(people);
	    
	    //for saving many user
	    //List<PeopleTable> PT=List.of(user,user1,user2);
	    //Iterable<PeopleTable> result = peopleRepo.saveAll(PT);
	    //Iterate
	    //result.forEach(us->{
	    //	System.out.println(us);
	    //});
	    
	    
	    //update user
//	    Optional<PeopleTable> opt = peopleRepo.findById(1);
//	    PeopleTable pt = opt.get();
//	    pt.setName("SRP");
//	    PeopleTable save = peopleRepo.save(pt);
//	    System.out.println(save);
	    
		
		
		//get user
//		Iterable<PeopleTable> findAll = peopleRepo.findAll();
		
		
		//iterate using iterator
//		Iterator<PeopleTable> iterator = findAll.iterator();
//		while(iterator.hasNext()) {
//			PeopleTable pt=iterator.next();
//			System.out.println(pt);
//		}
		
		//or
		//annonomous class
//		findAll.forEach(new Consumer<PeopleTable>() {
//
//			@Override
//			public void accept(PeopleTable t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		//or
		//lambda function
//		findAll.forEach(user->{
//			System.out.println(user);
//		});
		
		
		//delete user
//		peopleRepo.deleteById(102);
//		System.out.println("done!!!");
		
		
		//delete all
//		Iterable<PeopleTable> findAll = peopleRepo.findAll();
//		peopleRepo.deleteAll(findAll);
		
		
//		List<PeopleTable> findByCity = peopleRepo.findByCity("bbsr");
//		System.out.println(findByCity);
//		
//		
//	    List<PeopleTable> findByStatusStartingWith = peopleRepo.findByStatusStartingWith("java");
//	    System.out.println(findByStatusStartingWith);
		
		
		
//		List<PeopleTable> allUser = peopleRepo.getAllUser();
//	    allUser.forEach(e->{
//	    	System.out.println(e);
//	    });
	    
	    
	    List<PeopleTable> userByName = peopleRepo.getUserByName("soumya ranjan padhan");
	    System.out.println(userByName);
	}

}
