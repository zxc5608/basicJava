package 안용현;

public class SimpleEmail extends Thread {
private Charset Charset;
private hostName hostname;


public void sendMail(){

SimpleEmail  email = new SimpleEmail(); // 선언을 한다
email.setCharset("UTF-8");     // 인코딩을 설정한다.
email.setHostName("smtp.daum.com");
email.setFrom("5dols.daum.com", "5dols"); //보내는 사람
email.setAuthentication("USER", "PASSWORD"); //SMTP 인증이 필요할 경우(없으면 지워버린다.)
email.addTo("5dols.naver.com", "5dolsstory"); //받는사람
email.setSubject("메일의 제목입니다."); //메일 제목
email.setMsg("메일의 내용입니다."); //메일 내용
email.send(); //메일 발송
}

}
