package es.salesianos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.salesianos.model.Owner;
import es.salesianos.model.Pet;
import es.salesianos.repository.Repository;

@Service
public class ListService {
	private Repository repository = new Repository();
	
	
	public List<Owner> listAllOwners() {
		return repository.searchAll();
	}
	
	
	public List<Pet> listAllPets(Integer codOwner) {
		return repository.searchAllPets(codOwner);
	}
}
