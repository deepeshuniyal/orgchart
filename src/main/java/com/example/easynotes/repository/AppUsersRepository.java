package com.example.easynotes.repository;

import com.example.easynotes.entity.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUsersRepository extends JpaRepository<AppUsers, Integer> {
    Optional<AppUsers> findById(int id);

    /*@Query(value = "select id,first_name,designation,city_name,mobile,parent_id,level from app_users  where id in(SELECT * FROM (SELECT @pv:=(SELECT parent_id FROM app_users WHERE id = @pv) AS lv FROM app_users JOIN (SELECT @pv:=10) tmp) a WHERE lv IS NOT NULL) union all select id,first_name,designation,city_name,mobile,parent_id,level from app_users  where id=10 union all select id,first_name,designation,city_name,mobile,parent_id,level from (select * from app_users order by parent_id, id) user_sorted,(select @pv1:='10') temp where   find_in_set(parent_id, @pv1) and   length(@pv1:=concat(@pv1, ',', id)) order by parent_id", nativeQuery = true)
    List<AppUsers> findAllAppUsersData();*/

    List<AppUsers> findAllByOrderByParentId();
    List<AppUsers> findByIdOrderByParentId(Integer id);

        @Query( value = "select id ,active ,city_id ,city_name ,country_id ,country_name  ,created_by ,created_at ,designation   ,email  ,mobile ,modified_by   ,modified_at   ,name   ,profile_pic   ,region ,first_name ,last_name ,opt ,otp_timestamp ,password  ,level  ,parent_id from app_users  where id in(SELECT * FROM (SELECT @pv\\:=(SELECT parent_id FROM app_users WHERE id = @pv) AS lv FROM app_users JOIN (SELECT @pv\\:=:id) tmp) a WHERE lv IS NOT NULL) union all select id ,active ,city_id ,city_name ,country_id ,country_name  ,created_by ,created_at ,designation   ,email  ,mobile ,modified_by   ,modified_at   ,name   ,profile_pic   ,region ,first_name ,last_name ,opt ,otp_timestamp ,password  ,level  ,parent_id from app_users  where id=:id union all select id ,active ,city_id ,city_name ,country_id ,country_name  ,created_by ,created_at ,designation   ,email  ,mobile ,modified_by   ,modified_at   ,name   ,profile_pic   ,region ,first_name ,last_name ,opt ,otp_timestamp ,password  ,level  ,parent_id from (select * from app_users order by parent_id, id) user_sorted,(select @pv1\\:=:id) temp where   find_in_set(parent_id, @pv1) and   length(@pv1\\:=concat(@pv1, ',', id)) order by parent_id", nativeQuery = true)
    List<AppUsers> fetchData(@Param("id") Integer id);
}
