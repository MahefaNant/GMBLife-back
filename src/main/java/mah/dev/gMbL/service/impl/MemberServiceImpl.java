package mah.dev.gMbL.service.impl;

import jakarta.persistence.EntityNotFoundException;
import mah.dev.gMbL.entity.Member;
import mah.dev.gMbL.repository.MemberRepo;
import mah.dev.gMbL.service.MemberService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepo repo;

    public MemberServiceImpl(MemberRepo repo) {
        this.repo = repo;
    }

    @Override
    public CompletableFuture<Member> signup(Member member, String retypePassword) {
        return null;
    }

    @Override
    public void getToken(String mail) {
        Member member = repo.findFirstByMail(mail).orElseThrow(() -> new EntityNotFoundException("no GMBLife account with this mail!"));
        member.setToken(randomDigit());
        member.setToken_limit(LocalDateTime.now().plusMinutes(30));
        repo.save(member);
    }

    @Override
    public CompletableFuture<Integer> validToken(int token) {
        return null;
    }

    @Override
    public CompletableFuture<Object> resetPassword(String newPassword, String retypePassword) {
        return null;
    }

    @Override
    public CompletableFuture<Integer> authenticate(String mail, String password) {
        return null;
    }

    /*----------------------------*/

    boolean isMailExist(String mail) {
        Optional<Member> member = repo.findFirstByMail(mail);
        if(member.isPresent()) throw new EntityNotFoundException("Email already exists! Try another");
        return false;
    }

    int randomNumber() {
        int min = 0;
        int max = 9;
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    int randomDigit() {
        int[] preRes = new int[] {
                randomNumber(), randomNumber(), randomNumber(), randomNumber()
        };
        StringBuilder mix = new StringBuilder();
        for(int pR : preRes) mix.append(pR);
        return Integer.parseInt(String.valueOf(mix));
    }
}
