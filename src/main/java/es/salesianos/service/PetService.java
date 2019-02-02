package es.salesianos.service;

import org.springframework.stereotype.Service;

import es.salesianos.model.Pet;
import es.salesianos.repository.Repository;

@Service
public class PetService {

	private Repository repository = new Repository();

	
	
	
	public void addPet(Pet pet) {
		repository.insertPet(pet);
		
	}
	
	public void deletePet(Integer codOwner, String nombre) {
		repository.deletePet(codOwner, nombre);
	}
	
	public void updatePet(Pet pet, String nomAeditar) {
		repository.updatePet(pet, nomAeditar);
	}
}
