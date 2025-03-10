package programmers;

public class ParkWalk {
        public int[] solution(String[] park, String[] routes) {
            int H = park.length;
            int W = park[0].length();
            int[] now = new int[2]; // [row, col] (세로, 가로)

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (park[i].charAt(j) == 'S') {
                        now[0] = i;
                        now[1] = j;
                    }
                }
            }

            int[] dx = {-1, 1, 0, 0}; // N, S, W, E
            int[] dy = {0, 0, -1, 1};
            String[] directions = {"N", "S", "W", "E"};

            for (String route : routes) {
                String[] order = route.split(" ");
                String direction = order[0];
                int distance = Integer.parseInt(order[1]);

                int dirIdx = -1;
                for (int i = 0; i < 4; i++) {
                    if (directions[i].equals(direction)) {
                        dirIdx = i;
                        break;
                    }
                }

                int nx = now[0];
                int ny = now[1];
                boolean canMove = true;

                // 이동할 경로 확인
                for (int step = 1; step <= distance; step++) {
                    int nextX = now[0] + dx[dirIdx] * step;
                    int nextY = now[1] + dy[dirIdx] * step;

                    // 범위를 벗어나면 이동 불가능
                    if (nextX < 0 || nextX >= H || nextY < 0 || nextY >= W) {
                        canMove = false;
                        break;
                    }
                    // 장애물(`X`)을 만나면 이동 불가능
                    if (park[nextX].charAt(nextY) == 'X') {
                        canMove = false;
                        break;
                    }
                }

                // 이동 가능하면 위치 업데이트
                if (canMove) {
                    now[0] = nx + dx[dirIdx] * distance;
                    now[1] = ny + dy[dirIdx] * distance;
                }
            }

            return now;
        }
    }
