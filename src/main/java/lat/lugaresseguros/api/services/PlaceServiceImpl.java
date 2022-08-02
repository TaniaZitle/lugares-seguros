package lat.lugaresseguros.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lat.lugaresseguros.api.models.PlaceModel;
import lat.lugaresseguros.api.repositories.PlaceJpaRepository;

@Service

public class PlaceServiceImpl implements PlaceService {
	@Autowired
	PlaceJpaRepository repositorio;
	
	@Override
	public PlaceModel createPlaceService(PlaceModel place) {
		return repositorio.save(place);
	}

	@Override
	public List<PlaceModel> getPlaceService() {
		return repositorio.findAll();
	}

	@Override
	public PlaceModel updatePlaceService(Long id, PlaceModel place) {
		return repositorio.findById(id)
			      .map(placefound -> {
			        placefound.setName(place.getName());
			        return repositorio.save(placefound);
			      })
			      .orElseGet(() -> {
			        place.setId(id);
			        return repositorio.save(place);
			      });
	}

	@Override
	public void deletePlaceService(Long id) {
		repositorio.deleteById(id);
	}
	
	
	

}
