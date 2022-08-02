package lat.lugaresseguros.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lat.lugaresseguros.api.models.PlaceModel;
import lat.lugaresseguros.api.services.PlaceService;

import lat.lugaresseguros.api.services.PlaceService;

@RestController
@RequestMapping("/places")

public class PlacesController {
	@Autowired
	PlaceService placeService;
	
	//Endpoint para crear un lugar
	@PostMapping("/")
	public PlaceModel createPlace(@RequestBody PlaceModel place) {
		return placeService.createPlaceService(place);
	}
	@GetMapping("/")
	//Endpoint que devuelve todos los lugares
	public List<PlaceModel> readPlace() {
		return placeService.getPlaceService();
	}
	@PatchMapping("/{id}")
	//Endpoint que actualice un lugar por ID
	public PlaceModel updatePlace(@PathVariable("id") Long id, @RequestBody PlaceModel place) {
		return placeService.updatePlaceService(id,place);
	}
	@DeleteMapping("/{id}")
	//Endpoint que elimine un lugar por ID
	public void deletePlace(@PathVariable("id") Long id) {
		placeService.deletePlaceService(id);
	}
}
