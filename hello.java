@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
        return "abcdefg. Hello jenkins-test111, " + new Date();
    }
}
