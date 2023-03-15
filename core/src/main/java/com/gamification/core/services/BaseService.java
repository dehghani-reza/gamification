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
public abstract class BaseService<E extends BaseEntity> {

    protected final JpaRepository<E,Long> jpaRepository;
    public <S extends E> S save(S entity){
        return jpaRepository.save(entity);
    }

    public <S extends E> Iterable<S> saveAll(Iterable<S> entities){
        return jpaRepository.saveAll(entities);
    }

    public Optional<E> findById(Long id){
        return jpaRepository.findById(id);
    }

    public List<E> findAll(){
        return jpaRepository.findAll();
    }

    public List<E> findAll(Sort sort){
        return jpaRepository.findAll(sort);
    }

    public List<E> findAllById(Iterable<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    public Page<E> findAll(Pageable pageable) {
        return jpaRepository.findAll(pageable);
    }

    public void deleteById(Long id){
        jpaRepository.deleteById(id);
    }

    public void delete(E e){
        jpaRepository.delete(e);
    }

    public void deleteAllById(Iterable<Long> ids){
        jpaRepository.deleteAllById(ids);
    }

    public void deleteAll(Iterable<? extends E> entities){
        jpaRepository.deleteAll(entities);
    }

    public void deleteAllInBatch(Iterable<E> entities) {
        jpaRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> ids){
        jpaRepository.deleteAllByIdInBatch(ids);
    }

    public E getReferenceById(Long id){
        return jpaRepository.getReferenceById(id);
    }

}
