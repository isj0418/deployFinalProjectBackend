package com.example.sportsbatingproject.controller.kleague;
import com.example.sportsbatingproject.controller.kleague.dto.KleaguePlayerDTO;
import com.example.sportsbatingproject.controller.kleague.dto.KleaguePlayerDetailDTO;
import com.example.sportsbatingproject.controller.kleague.dto.KleagueTeamDTO;
import com.example.sportsbatingproject.service.kleague.KleaguePlayerDetailService;
import com.example.sportsbatingproject.service.kleague.KleaguePlayerService;
import com.example.sportsbatingproject.service.kleague.KleagueTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@Controller
@ResponseBody
@RequestMapping("/kLeague")
@RequiredArgsConstructor
public class KleagueController {
    private final KleaguePlayerService kleaguePlayerService;
    private final KleagueTeamService kleagueService;
    private final KleaguePlayerDetailService kleaguePlayerDetailService;

    @GetMapping("/player")
    public List<KleaguePlayerDTO> findPlayerAll() {
        List<KleaguePlayerDTO> kleaguePlayerDTOList = kleaguePlayerService.findAll();
        return kleaguePlayerDTOList;
    }
//    KleaguePlayerDTO

    @GetMapping("/team")
    public List<KleagueTeamDTO> findTeamAll() {
        List<KleagueTeamDTO> kleagueTeamDTOList = kleagueService.findAll();
        System.out.println(kleagueTeamDTOList);
        return kleagueTeamDTOList;
    }
    @GetMapping("/player/{kLeaguePlayerId}")
    public KleaguePlayerDetailDTO findById(@PathVariable String kLeaguePlayerId) {
        System.out.println(kLeaguePlayerId);
        KleaguePlayerDetailDTO kleaguePlayerDetailDTO = kleaguePlayerDetailService.findById(kLeaguePlayerId);
        return kleaguePlayerDetailDTO;
    }

    @GetMapping("/current")
    public String pythonExecute() throws IOException , InterruptedException {

        ProcessBuilder builder = new ProcessBuilder();
        builder.command("sh", "-c", "cd /Users/jomin/Desktop/SportInfo/KLeague && python k_league_current_game.py");
        Process process = builder.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream() , "UTF-8"));
        String line = br.readLine();
        process.waitFor();
        process.destroy();
        return line;
    }
}
