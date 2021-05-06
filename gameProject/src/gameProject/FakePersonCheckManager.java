package gameProject;

public class FakePersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Person person) {
		if(person.getNationalityId()=="300")
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
