import styled from 'styled-components';
import TopBarSelects from '../molecule/TopBarSelects';
import SearchBar from '../molecule/SearchBar';

const TopBar = () => {
  return (
    <StyledTopBar>
      <TopBarSelects />
      <SearchBar />
    </StyledTopBar>
  );
};

const StyledTopBar = styled.div`
  display: flex;
  justify-content: center;
  width: 100%;
  padding: 10px;
  background-color: white;
  box-shadow: var(--bar-shadow);
  border-left: 3px solid var(--light-grey-color);
`;

export default TopBar;
