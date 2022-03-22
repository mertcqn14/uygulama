package ibmtal.trendyol.database;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OptionsDao extends JpaRepository<OptionsDao, Integer> {
	ArrayList<OptionsDao> getByUsername(String optionsDao);
	}
