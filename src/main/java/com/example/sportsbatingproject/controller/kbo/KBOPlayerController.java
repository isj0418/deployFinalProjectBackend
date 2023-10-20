package com.example.sportsbatingproject.controller.kbo;

import com.example.sportsbatingproject.controller.kbo.dto.KBOHitterDTO;
import com.example.sportsbatingproject.controller.kbo.dto.KBOPitcherDTO;
import com.example.sportsbatingproject.controller.kbo.dto.KBOPlayerDTO;
import com.example.sportsbatingproject.service.kbo.KBOPlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class KBOPlayerController {
    private final KBOPlayerService kboPlayerService;
    @GetMapping("/playerList")
    public List<KBOPlayerDTO> findAll(){
        //System.out.println(kboPlayerService.findAllPlayers());
        return kboPlayerService.findAllPlayers();
    }

    @GetMapping("/pitcherDetail/{playerId}")
    public KBOPitcherDTO findPitcher(@PathVariable Long playerId){
        return kboPlayerService.findPitcher(playerId);
    }

    @GetMapping("/hitterDetail/{playerId}")
    public KBOHitterDTO findHitter(@PathVariable Long playerId){
        return kboPlayerService.findHitter(playerId);
    }
/*    @GetMapping("/playerList/{playerId}")
    public KBOPlayerDTO findPlayerById(@PathVariable Long playerId) {
        return kboPlayerService.findPlayerById(playerId);
    }*/
}
