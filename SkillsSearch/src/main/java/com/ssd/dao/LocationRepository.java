/**
 * 
 */
package com.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.entity.Location;

/**
 * @author abhimanyu
 *
 */
public interface LocationRepository extends JpaRepository<Location, Long>{

	Location findLocationByLocationId(int locationId);
}
