package es.salesianos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Pet;
import es.salesianos.service.OwnerService;
import es.salesianos.service.PetService;

@Controller
public class PetController {
	
	
	@Autowired
	OwnerService serviceOwner;
	@Autowired
	PetService servicePet;
	
	
	@GetMapping(path="recoveryAddCodOwner")
	public ModelAndView getAddPetPage(@RequestParam Integer codOwner) {
		ModelAndView model = new ModelAndView("addPet");
		
		model.addObject("pet",new Pet());
		return model;
	}
	
	@PostMapping(path="/addPet")
	public String savePet(Pet pet)  {
		servicePet.addPet(pet);
		return "petSaved";
	}
	
	@GetMapping(path="/confirmarEliminadoOwner")
	public ModelAndView getDeletePetPage(@RequestParam Integer codOwner) {
		ModelAndView model = new ModelAndView("confirmDeleteOwner");
		model.addObject("codOwner",codOwner);
		
		return model;
	}
	
	@PostMapping(path = "/deletePet")
	public String deletePet(@RequestParam Integer codOwner, @RequestParam String name, @RequestParam String answer) {
		
		if(answer.equals("SI")) {
			servicePet.deletePet(codOwner, name);
		}
		return "listOwner";
	}
	
	
	

}
