package chat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;


    @GetMapping("/save-form")
    public String saveForm() {
        return "save-form";
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("models",chatService.findAll());
        return "index";
    }
    @GetMapping("/v2")
    public String indexV2(Model model) {
        model.addAttribute("models",chatService.findAll());
        return "index";
    }
    @GetMapping("/v3")
    public String indexV3(Model model) {
        model.addAttribute("models",chatService.findAll());
        return "index";
    }

    @PostMapping("/chat")
    public String chat(String msg){
        chatService.save(msg);
        return "redirect:/";
    }

}
