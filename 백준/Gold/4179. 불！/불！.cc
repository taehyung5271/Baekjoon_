#include <bits/stdc++.h>
using namespace std;

int R, C;
char arr[1004][1004];
int f_visited[1004][1004]; // 불이 번지는 시간
int j_visited[1004][1004]; // 지훈이가 이동하는 시간
int dy[] = {1, 0, -1, 0};
int dx[] = {0, 1, 0, -1};

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> R >> C;
    queue<pair<int, int>> q_f; // 불을 위한 큐
    queue<pair<int, int>> q_j; // 지훈이를 위한 큐

    // 방문 배열 초기화 (불이 도달하지 못하는 곳은 아주 큰 값으로)
    fill(&f_visited[0][0], &f_visited[0][0] + 1004 * 1004, 1e9);

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cin >> arr[i][j];
            if (arr[i][j] == 'F') {
                q_f.push({i, j});
                f_visited[i][j] = 1; // 불 시작점
            } else if (arr[i][j] == 'J') {
                q_j.push({i, j});
                j_visited[i][j] = 1; // 지훈이 시작점
            }
        }
    }

    // 1. 불의 BFS: 모든 불이 각 칸에 도달하는 최소 시간을 먼저 구함
    while (!q_f.empty()) {
        pair<int, int> cur = q_f.front(); q_f.pop();
        for (int i = 0; i < 4; i++) {
            int ny = cur.first + dy[i];
            int nx = cur.second + dx[i];
            if (ny < 0 || nx < 0 || ny >= R || nx >= C) continue;
            if (arr[ny][nx] == '#' || f_visited[ny][nx] != 1e9) continue;
            
            f_visited[ny][nx] = f_visited[cur.first][cur.second] + 1;
            q_f.push({ny, nx});
        }
    }

    // 2. 지훈이의 BFS: 불보다 빨리 도착할 수 있는 곳만 이동
    while (!q_j.empty()) {
        pair<int, int> cur = q_j.front(); q_j.pop();
        
        //지훈이가 가장자리에 도달했다면 다음 이동 시 탈출 가능
        for (int i = 0; i < 4; i++) {
            int ny = cur.first + dy[i];
            int nx = cur.second + dx[i];

            //범위를 벗어남 = 탈출 성공
            if (ny < 0 || nx < 0 || ny >= R || nx >= C) {
                cout << j_visited[cur.first][cur.second] << "\n";
                return 0;
            }

            if (arr[ny][nx] == '#' || j_visited[ny][nx] != 0) continue;
            //지훈이가 도착하는 시간이 불이 도착하는 시간보다 빨라야 함!
            if (f_visited[ny][nx] <= j_visited[cur.first][cur.second] + 1) continue;

            j_visited[ny][nx] = j_visited[cur.first][cur.second] + 1;
            q_j.push({ny, nx});
        }
    }

    cout << "IMPOSSIBLE\n";
    return 0;
}