package com.gamification.core.services;

import com.gamification.core.entities.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public abstract class BaseService<Entity extends BaseEntity> {

    protected final JpaRepository<Entity,Long> jpaRepository;
    public <S extends Entity> S save(S entity){
        return jpaRepository.save(entity);
    }

    public <S extends Entity> Iterable<S> saveAll(Iterable<S> entities){
        return jpaRepository.saveAll(entities);
    }

    public Optional<Entity> findById(Long id){
        return jpaRepository.findById(id);
    }

    public List<Entity> findAll(){
        return jpaRepository.findAll();
    }

    public List<Entity> findAll(Sort sort){
        return jpaRepository.findAll(sort);
    }

    public List<Entity> findAllById(Iterable<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    public Page<Entity> findAll(Pageable pageable) {
        return jpaRepository.findAll(pageable);
    }

    public void deleteById(Long id){
        jpaRepository.deleteById(id);
    }

    public void delete(Entity entity){
        jpaRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> ids){
        jpaRepository.deleteAllById(ids);
    }

    public void deleteAll(Iterable<? extends Entity> entities){
        jpaRepository.deleteAll(entities);
    }

    public void deleteAllInBatch(Iterable<Entity> entities) {
        jpaRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> ids){
        jpaRepository.deleteAllByIdInBatch(ids);
    }

    public Entity getReferenceById(Long id){
        return jpaRepository.getReferenceById(id);
    }

}
