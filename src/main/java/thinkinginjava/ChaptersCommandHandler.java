package thinkinginjava;

import java.util.List;
import java.util.Scanner;

public class ChaptersCommandHandler {

    private List<Chapter> chapterList;

    public ChaptersCommandHandler(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public void printChapterList() {
        System.out.println("\nList of all available chapters:\n");
        for (Chapter chapter : chapterList) {
            System.out.println("Id: " + chapter.getId());
            System.out.println("Name: " + chapter.getName());
            System.out.println("--------------------------------------------------------------------" +
                    "-------------------------------------------------------------------------------" +
                    "----------");
        }

        System.out.println("\n");
    }

    public Chapter askUserForChapter(Scanner scan) {
        ChapterCommandResponse chapterCommandResponse;
        String chapterId = null;

        while (true) {
            System.out.print("Please enter a chapter id from the list, type \"exit\" to exit program or type \"again\" " +
                    "to print chapter list again: ");

            String userInput = scan.next();

            chapterCommandResponse = handleChapterResponse(userInput);
            switch (chapterCommandResponse) {
                case ERROR_NO_CHAPTER_FOUND:
                case ERROR_EMPTY_INPUT: {
                    System.out.println("Please provide a valid command or chapter id!");
                    break;
                }
                case AGAIN: {
                    printChapterList();
                    break;
                }
                case EXIT: {
                    System.out.println("The program will finish now");
                    System.exit(-1);
                }
                case SUCCESS: {
                    chapterId = userInput;
                    break;
                }
                default: {
                    //Do nothing
                }
            }

            if (chapterCommandResponse.canProceed) {
                break;
            }
        }

        return getChapter(chapterId);
    }

    private Chapter getChapter(String chapterId) {
        for (Chapter chapter : chapterList) {
            if (chapter.getId().equals(chapterId)) {
                return chapter;
            }
        }

        return null;
    }

    private ChapterCommandResponse handleChapterResponse(String chapterCommand) {
        if (!TextUtils.isEmpty(chapterCommand)) {
            if (ChapterCommandResponse.EXIT_COMMAND.equals(chapterCommand)) {
                return ChapterCommandResponse.EXIT;
            } else if (ChapterCommandResponse.AGAIN_COMMAND.equals(chapterCommand)) {
                return ChapterCommandResponse.AGAIN;
            }

            if (getChapter(chapterCommand) != null) {
                return ChapterCommandResponse.SUCCESS;
            } else {
                return ChapterCommandResponse.ERROR_NO_CHAPTER_FOUND;
            }
        }
        return ChapterCommandResponse.ERROR_EMPTY_INPUT;
    }

    public enum ChapterCommandResponse {
        SUCCESS(true), ERROR_EMPTY_INPUT(false), ERROR_NO_CHAPTER_FOUND(false), AGAIN(false), EXIT(true);

        private static final String EXIT_COMMAND = "exit";
        private static final String AGAIN_COMMAND = "again";

        private boolean canProceed;

        ChapterCommandResponse(boolean canProceed) {
            this.canProceed = canProceed;
        }
    }

}
