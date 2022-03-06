package tn.esprit.spring.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.Forum;
import tn.esprit.spring.services.IServiceForum;

@EnableSwagger2
@Api(tags = "Forum Management")
@RestController
@RequestMapping("/ForumManagement")
public class ForumController {
IServiceForum serviceForum; 
@PostMapping("/add-forum")
@ResponseBody
public Forum addForum(@RequestBody Forum f)
{
Forum forum= serviceForum.addForum(f);
return forum;
}

}
