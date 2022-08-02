package lat.lugaresseguros.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lat.lugaresseguros.api.models.PlaceModel;

public interface PlaceJpaRepository extends JpaRepository<PlaceModel, Long> {

}
