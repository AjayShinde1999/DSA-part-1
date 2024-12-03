package part_6;

class FrequencyCount {
    public static void main(String[] args){
        String str = "ajay shinde vs";
        frequency(str);
    }

    public static void frequency(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){

            if(ch[i] == ' '){
                continue;
            }

            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(ch[i] == ch[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ch[i] +" : "+count);
        }

    }
}
