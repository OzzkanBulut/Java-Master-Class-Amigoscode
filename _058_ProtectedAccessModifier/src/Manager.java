public class Manager extends Employee{
    private  int teamSize;

    public Manager(String name, int age) {
        super(name, age);
    }
    public Manager(String name, int age,int teamSize){
        super(name,age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void report(){
        System.out.println("manager has reported");
    }
}
