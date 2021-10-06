package baseball.dto;

public class ComputerDTO {

    // 컴퓨터숫자(정답)
    private String computerNumber;

    public ComputerDTO(String initNumber) {
        this.computerNumber = initNumber;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }
}
