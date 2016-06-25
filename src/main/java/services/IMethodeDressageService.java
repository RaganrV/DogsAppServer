package services;
import java.util.List;

import javax.ejb.Remote;


import entities.MethodeDressage;

@Remote

public interface IMethodeDressageService {

	void addMethodeDressage(MethodeDressage m);
	void deleteMethodeDressage(MethodeDressage m);
	void updateMethodeDressage(MethodeDressage m);
	List<MethodeDressage> getAllMethodeDressage();

}
