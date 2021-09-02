package com.cos.viewapp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



// RestController (데이터를 리턴한다)
// Controller (파일을 리턴한다)

@Controller
public class FrontController {

      // http://localhost:8080/home
      // 디스패쳐 서블릿 /home 파싱(주소를 분석)
       // ioC 컨테이너에 @RestController, @Controller로 생성된 객체만 찾는다. 
       // /home 메소드를 response(호출)
   
     @GetMapping("/home")
     public String home(Model model) { //Request  == Model 스프링에서 리퀘스트를 모델로 바꿔쓰는것
    	 
         //ViewResolver 클래스
         //src/main/resources/templates(prefix)
         //.mustache(suffix)
    	 
    	 String name = "김덕배";  
    	 model.addAttribute("name", name);
    	 
    	 List<Board> boards = new ArrayList<>();
    	 boards.add(new Board(1,"제목1"));
    	 boards.add(new Board(2,"제목2"));
    	 boards.add(new Board(3,"git실험"));
    	 
    	 
    	 model.addAttribute("boards", boards);
    	 
    	 return "home"; // RequestDispatcher가 자동 작동
     }
     }
     