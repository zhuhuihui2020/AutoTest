package leetcode;
//罗马数字转整数
public class Code13 {
    public static int romanToInt(String s) {
        char[] cs=s.toCharArray();
        int sum=0;
        int i;
        for(i=0;i<cs.length-1;i++){
            if(cs[i]=='I'){
                if(cs[i+1]=='V'){
                    sum+=4;
                    i++;
                }else if(cs[i+1]=='X'){
                    sum+=9;
                    i++;
                }else {
                    sum+=1;
                }
            }else if(cs[i]=='X'){
                if(cs[i+1]=='L'){
                    sum+=40;
                    i++;
                }else if(cs[i+1]=='C'){
                    sum+=90;
                    i++;
                }else {
                    sum+=10;
                }
            }else if(cs[i]=='C'){
                if(cs[i+1]=='D'){
                    sum+=400;
                    i++;
                }else if(cs[i+1]=='M'){
                    sum+=900;
                    i++;
                }else {
                    sum+=100;
                }
            }else if(cs[i]=='V'){
                sum+=5;
            }else if(cs[i]=='L'){
                sum+=50;
            }else if(cs[i]=='D'){
                sum+=500;
            }else if(cs[i]=='M'){
                sum+=1000;
            }
        }
        if(i==cs.length-1){
            sum+=getNum(cs[i]);
        }
        return sum;
    }

    public static int getNum(char c){
//        if(c=='I'){
//            return 1;
//        }else if(c=='V'){
//            return 5;
//        }else if(c=='X'){
//            return 10;
//        }else if(c=='L'){
//            return 50;
//        }else if(c=='C'){
//            return 100;
//        }else if(c=='D'){
//            return 500;
//        }else if(c=='M'){
//            return 1000;
//        }
//        return 0;
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String s="CMXCIX";
        System.out.println(romanToInt(s));
    }
}
