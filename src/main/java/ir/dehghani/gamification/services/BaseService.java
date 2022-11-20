package ir.dehghani.gamification.services;

import ir.dehghani.gamification.entities.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public abstract class BaseService<Entitiy extends BaseEntity> {

    private final JpaRepository<Entitiy,Long> jpaRepository;
    public <S extends Entitiy> S save(S entity){
        return jpaRepository.save(entity);
    }

    public <S extends Entitiy> Iterable<S> saveAll(Iterable<S> entities){
        return jpaRepository.saveAll(entities);
    }

    public Optional<Entitiy> findById(Long id){
        return jpaRepository.findById(id);
    }

    public List<Entitiy> findAll(){
        return jpaRepository.findAll();
    }

    public List<Entitiy> findAll(Sort sort){
        return jpaRepository.findAll(sort);
    }

    public List<Entitiy> findAllById(Iterable<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    public Page<Entitiy> findAll(Pageable pageable) {
        return jpaRepository.findAll(pageable);
    }

    public void deleteById(Long id){
        jpaRepository.deleteById(id);
    }

    public void delete(Entitiy entity){
        jpaRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> ids){
        jpaRepository.deleteAllById(ids);
    }

    public void deleteAll(Iterable<? extends Entitiy> entities){
        jpaRepository.deleteAll(entities);
    }

    public void deleteAllInBatch(Iterable<Entitiy> entities) {
        jpaRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> ids){
        jpaRepository.deleteAllByIdInBatch(ids);
    }

    public Entitiy getReferenceById(Long id){
        return jpaRepository.getReferenceById(id);
    }

}
