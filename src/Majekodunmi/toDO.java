package Majekodunmi;

import java.util.ArrayList;


public class toDO {

    private ArrayList<String> toDOList = new ArrayList<String>();

    //TO add an acticvity to the list
    public void addActivity (String activity){
        toDOList.add(activity);
    }


    //TO return all activities in my List
    public ArrayList<String> getToDoList(){
        return toDOList;

    }

    //TO remove an activity from the list
    public void removeActivity(int activity){
               toDOList.remove(activity);
        System.out.println("Activity " + (activity + 1) + " has been removed from the list.");
        }


    //TO modifiy activity in the List
    public void modifyActivity(int position, String newActivity) {
               toDOList.set((position-1), newActivity);
            System.out.println("Activity  " + position + " has been modified.");
        }

    //TO print out List
    public void printList() {
        System.out.println("You have " + toDOList.size() + " activties in your ToDO List.");

        for(int i=0; i< toDOList.size(); i++) {
            System.out.println((i+1) + ". " + toDOList.get(i));

        }
    }

}
