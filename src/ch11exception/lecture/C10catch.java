package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {

        /*}catch(ArrayIndexOutOfBoundsException e){

        }catch(NumberFormatException e){
*/

        } catch (NullPointerException | ClassCastException |NumberFormatException e){
        } finally {


        }
    }
}

/*
두개의 exception에 해당하는 코드가 동일하다면?
  | 를 쓰면 된다. 여
 */
