package javiervs.dev.reto3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PasswordLength {
    LENGTH_8(8),
    LENGTH_16(16);

    private final int value;
}
