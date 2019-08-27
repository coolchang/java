
/**
 * 여기에 XCopy 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class XCopy
{
    public static void main (String[] args) {
        
        int orig = 42;
        
        XCopy x = new XCopy();
        
        int y = x.go(orig);
        
        System.out.println(orig + " " + y);
    }    
    
    int go(int arg){
    
        arg = arg * 2;
        
        return arg;
    }
}
