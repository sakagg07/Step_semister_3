package arrays2.class_problems;

public class DuplicateTeamNameFinder {
    static String findDuplicateTeam(String[]teamNames){
        for(int i=0;i<teamNames.length;i++){
            for(int j=i+1;j<teamNames.length;j++){
                if(teamNames[i].equals(teamNames[j])){
                    return "Found Duplicate Name: "+teamNames[i];
                }
            }
        }
        return"no duplicate";
    }
    public static void main(String[] args) {
        String[] TeamNames={"ByteForce","CodeCrafters","ByteForce"};
        String result=findDuplicateTeam(TeamNames);
        System.out.println(result);
    }
}