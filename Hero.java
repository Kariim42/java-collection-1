public class Hero {

	/*Hero blackWidow = new Hero("Black Widow", 34);
	Hero captainAmerica = new Hero("Captain America", 100);
	Hero vision = new Hero("Vision", 3);
	Hero ironMan = new Hero("Iron man", 48);
	Hero scarletWich = new Hero("Scarlet Wich", 48);
	Hero thor= new Hero("Thor", 1500);
	Hero hulk = new Hero("Hulk", 49);
	Hero doctorStrange = new Hero("Doctor Strange", 49);*/
	
    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}