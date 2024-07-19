package mah.dev.gMbL.service;

import mah.dev.gMbL.entity.Member;

import java.util.concurrent.CompletableFuture;

public interface MemberService {
    CompletableFuture<Member> signup(Member member , String retypePassword);

    void getToken(String mail);

    CompletableFuture<Integer> validToken(int token);

    CompletableFuture<Object> resetPassword(String newPassword, String retypePassword);

    CompletableFuture<Integer> authenticate(String mail, String password);
}
