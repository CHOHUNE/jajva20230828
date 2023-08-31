package ch08interface.book.sec11.exam07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    //인터페이스를 쓰기 위해 매개변수 칸에서 인터페이스타입 변수 dao를 할당했다.
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MysqlDao());
    }

}