package com.mac.sql.spring;

import com.mac.sql.common.CricketInfoRepository;
import com.mac.sql.common.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CricketController {
    CricketInfoRepository cricketInfoRepository = new CricketInfoRepository();

    @GetMapping("/players")
    public List<Player> playerList() throws Exception {
        List<Player> players = cricketInfoRepository.displayData();
        return players;
    }

    @PostMapping("/players")
    public String playerList(@RequestBody Player player) throws Exception {
        cricketInfoRepository.insertIntoTable(player.getName(), player.getResponsibility());
        return "Player data added successfully.";
    }

    @PutMapping("/players")
    public String playerListPut(@RequestBody Player player) throws Exception {
        cricketInfoRepository.updateTable(player.getId(),player.getName(), player.getResponsibility());
        return "Player data updated successfully.";
    }

    @DeleteMapping("/players")
    public String playerListDelete(@RequestBody Player player) throws Exception {
        cricketInfoRepository.deleteFromTable(player.getId());
        return "Player data deleted successfully.";
    }

    @DeleteMapping("/players/{ID}")
    public String playerListDelete(@PathVariable("ID") int id) throws Exception {
        cricketInfoRepository.deleteFromTable(id);
        return "Player data deleted successfully.";
    }

    @DeleteMapping("/players1/{id}")
    public String playerListDelete1(@PathVariable int id) throws Exception {
        cricketInfoRepository.deleteFromTable(id);
        return "Player data deleted successfully.";
    }

    @GetMapping("/search/{name}")
    public List<Player> playerList(@PathVariable String name) throws Exception {
        List<Player> players = cricketInfoRepository.search(name);
        return players;
    }

}
