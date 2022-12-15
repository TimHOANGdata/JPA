package poe20221107.poe20221107.demojpa;

import java.util.List;

public class MonProgrammePrincipal {

    public static void main(String[] args) {

//        Person p = new Person("Marie","Dupont");
//        PersonDAO.create(p);


//        Person personFromDatabase = PersonDAO.findById(1L);
//        //1L est 1 de type Long
//        System.out.println("From Database: "+personFromDatabase.getFirstName()+" "+personFromDatabase.getLastName());


//        Person personToBeDeleted = PersonDAO.findById(1L);
//        PersonDAO.delete(personToBeDeleted);

//        Person personToUpdate = PersonDAO.findById(3L);
//        personToUpdate.setFirstName("abc");
//        PersonDAO.update(personToUpdate);


//            Afficher toutes les personnes dans la base => une list de personne
//        List<Person> persons = PersonDAO.findAll();
//        for (Person p : persons) {
//            System.out.println("first name : " + p.getFirstName() + "| Last name : " + p.getLastName());
//        }


//         Suppression par id:
//            PersonDAO.deleteById(3L);



           Address paris = new Address(12,"rue des Champ-Elysee","Paris");
           AddressDAO.create(paris);
           Person newPerson = new Person("afasa","afafasf");
           newPerson.setAddress(paris);
           PersonDAO.create(newPerson);
           
           
            // adresses : Lecture
            Person person = PersonDAO.findById(1L);
            System.out.println(person);
            Address address = person.getAddress();
            System.out.println(address);
    }

}
