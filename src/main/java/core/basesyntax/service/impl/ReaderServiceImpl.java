package core.basesyntax.service.impl;

import core.basesyntax.service.ReaderService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    @Override
    public List<String> readFromFile(String filePath) {
        File file = new File(filePath);
        List<String> strings;
        try {
             strings = Files.readAllLines(file.toPath());
            return strings;
        } catch (IOException e) {
            throw new RuntimeException("Can't read from " + filePath,e);
        }
    }
}