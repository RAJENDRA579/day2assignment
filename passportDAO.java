package passportTestDemo;

import java.util.Set;

public interface passportDAO {

	void addpassport(passport passport);
	void modifypassport(passport pass);
	void deletepassport(int passportno);
	passport findpassport(int passport);
	Set<passport> findAllpassports();

}
