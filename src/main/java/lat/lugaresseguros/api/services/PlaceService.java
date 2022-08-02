package lat.lugaresseguros.api.services;

import java.util.List;

import lat.lugaresseguros.api.models.PlaceModel;

public interface PlaceService {
	PlaceModel createPlaceService(PlaceModel place);
	List<PlaceModel> getPlaceService();
	PlaceModel updatePlaceService(Long id, PlaceModel place);
	void deletePlaceService(Long id);

}
